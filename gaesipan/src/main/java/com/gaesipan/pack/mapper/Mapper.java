package com.gaesipan.pack.mapper;

import java.util.List;

import com.gaesipan.pack.DTO.BoardDTO;
import com.gaesipan.pack.DTO.CommentDTO;
import com.gaesipan.pack.DTO.Criteria;
import com.gaesipan.pack.DTO.FileDTO;
import com.gaesipan.pack.DTO.LoginVO;
import com.gaesipan.pack.DTO.UserDTO;
import com.gaesipan.pack.DTO.bdtoCri;

public interface Mapper {
	
	public List<BoardDTO> list(Criteria cri);

	public List<BoardDTO> searchList(Criteria cri);
	
	public List<BoardDTO> NoticeList(Criteria cri);

	public List<BoardDTO> searchNoticeList(Criteria cri);
	
	public int listTotalCount();
	
	public int NoticeListTotalCount();
	
	public BoardDTO content(String seq);
	
	public void upHit(String seq);
	
	public void write(BoardDTO dto);
	
	public void modify(BoardDTO dto);
	
	public void delete(bdtoCri bdtoCri);
	
	public void attachFile(FileDTO fileDTO);

	public List<FileDTO> searchFiles(String seq);

	public List<BoardDTO> nextPrev(String seq);

	public List<BoardDTO> NoticeNextPrev(String seq);

	public void applyMTtime(bdtoCri bdtoCri);

	public UserDTO authenticate(LoginVO loginVO);

	public int IdOverlapCheck(String id);

	public int PasswordOverlapCheck(String password);

	public int NicknameOverlapCheck(String nickname);

	public int EmailOverlapCheck(String email);

	public int TelOverlapCheck(String tel);

	public void sign_up(UserDTO userDTO);

	public UserDTO userInfo(String seq);

	public void updateUser(UserDTO userDTO);

	public void deleteUser(String seq);

	public float fileSizeKb(int seq);

	public List<CommentDTO> showComment(String seq);

	public String maxGroup(String seq);

	public void commentWrite(CommentDTO dto);

	public void commentDelete(String seq);
	
}
