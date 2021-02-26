package edu.bit.ex.mapper;

import java.util.List;

import edu.bit.ex.vo.BoardVO;

public interface BoardMapper {

	public List<BoardVO> getList();

	public void write(BoardVO boardVO);

	public BoardVO content(BoardVO boardVO);

}
