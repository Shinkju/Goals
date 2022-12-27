package com.ambition.mvc.bucket.model.dao;

import static com.ambition.mvc.common.jdbc.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

import com.ambition.mvc.bucket.model.dto.BucketDto;
import com.ambition.mvc.common.config.ConfigLocation;

public class BucketDao {
	
	private final Properties prop;
	
	public BucketDao() {
		prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream(ConfigLocation.MAPPER_LOCATION + "bucket-mapper.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	//todoList 조회
	public List<BucketDto> selectAllTodoList(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<BucketDto> todoList = null;
		String query = prop.getProperty("selectAllTodo");	//찾아올 쿼리의 key값
		
		
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			todoList = new ArrayList<>();
			
			while(rset.next()) {
				BucketDto bucket = new BucketDto();
				bucket.setBucketCode(rset.getLong("BUCKET_CODE"));
				bucket.setContent(rset.getString("CONTENT"));
				bucket.setCofigDate(rset.getDate("COFIG_DATE"));
				
				todoList.add(bucket);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return todoList;
	}
	
	


	//todoList 등록
	public int insertTodo(Connection conn, BucketDto bucket) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertTodo");
		
		
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bucket.getContent());
			pstmt.setDate(2, bucket.getCofigDate());
			pstmt.setLong(3, bucket.getCategory().getCategoryCode());
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn);
		}
		
		return result;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
