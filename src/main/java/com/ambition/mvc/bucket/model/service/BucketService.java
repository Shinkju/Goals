package com.ambition.mvc.bucket.model.service;

import java.sql.Connection;
import java.util.List;

import static com.ambition.mvc.common.jdbc.JDBCTemplate.*;
import com.ambition.mvc.bucket.model.dao.BucketDao;
import com.ambition.mvc.bucket.model.dto.BucketDto;

public class BucketService {
	
	private final BucketDao bucketDao;
	
	public BucketService() {
		bucketDao = new BucketDao();
	}

	/* todoList 조회 */
	public List<BucketDto> selectAllTodoBucket() {
		
		Connection conn = getConnection();
		
		List<BucketDto> todoList = bucketDao.selectAllTodoList(conn);
		
		close(conn);
		
		return todoList;
	}

}
