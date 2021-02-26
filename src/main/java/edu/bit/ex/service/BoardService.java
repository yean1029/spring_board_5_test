package edu.bit.ex.service;

import java.util.List;

import edu.bit.ex.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> getList();

	public void write(BoardVO boardVO);

	public BoardVO content(BoardVO boardVO);

}
