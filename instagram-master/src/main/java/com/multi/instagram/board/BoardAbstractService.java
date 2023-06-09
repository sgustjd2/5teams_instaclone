package com.multi.instagram.board;

import java.util.ArrayList;
import java.util.List;

public interface BoardAbstractService {
	int insertBoard(BoardDTO board);
	int insertBoard(BoardDTO board, List<BoardFileDTO> boardfiledtolist); 
	
	List<BoardDTO> selectBoard();
	List<BoardFileDTO> selectFile();
	
	BoardUploadDTO readBoard(String boardId, String WriterId);
	int deleteBoard(String boardId);
	int update(String boardContent, String boardId);


}
