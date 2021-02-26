package edu.bit.ex.service;

import java.util.List;
import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Service
@Log4j
public class BoardServiceImpl implements BoardService{
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList(){
		return mapper.getList();
	}

	@Override
	public void write(BoardVO boardVO) {
		mapper.write(boardVO);
		
	}

	@Override
	public BoardVO content(BoardVO boardVO) {
		log.info("content");
		return mapper.content(boardVO);
	}

}
