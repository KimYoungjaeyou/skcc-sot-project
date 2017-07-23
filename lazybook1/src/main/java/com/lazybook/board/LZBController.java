package com.lazybook.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LZBController {

    @Autowired
    private boardSVC boardSvc;
    
    // 리스트
    @RequestMapping(value = "/boardList")
   	public String boardList(ModelMap modelMap) throws Exception {
    	List<?> listview   = boardSvc.selectBoardList();
        
    	modelMap.addAttribute("listview", listview);
        return "board/boardList";
    }
    
    // 글 쓰기 
/*    @RequestMapping(value = "/boardForm")
   	public String boardForm() throws Exception {
        return "board/boardForm";
    }
    
    @RequestMapping(value = "/boardSave")
   	public String boardSave(@ModelAttribute boardVO boardInfo) throws Exception {
    	
    	boardSvc.insertBoard(boardInfo);
    	
        return "redirect:/boardList";
    }

    // 글 수정
    @RequestMapping(value = "/boardUpdate")
   	public String boardUpdate(HttpServletRequest request, ModelMap modelMap) throws Exception {
    	
    	String brdno = request.getParameter("brdno");
    	
    	boardVO boardInfo = boardSvc.selectBoardOne(brdno);
        
    	modelMap.addAttribute("boardInfo", boardInfo);
    	
        return "board/boardUpdate";
    }
    
    @RequestMapping(value = "/boardUpdateSave")
   	public String boardUpdateSave(@ModelAttribute boardVO boardInfo) throws Exception {
    	
    	boardSvc.updateBoard(boardInfo);
    	
        return "redirect:/boardList";
    }    

    // 글 읽기
    @RequestMapping(value = "/boardRead")
   	public String boardRead(HttpServletRequest request, ModelMap modelMap) throws Exception {
    	
    	String brdno = request.getParameter("brdno");
    	
    	boardVO boardInfo = boardSvc.selectBoardOne(brdno);
        
    	modelMap.addAttribute("boardInfo", boardInfo);
    	
        return "board/boardRead";
    }
    
    // 글 삭제
    @RequestMapping(value = "/boardDelete")
   	public String boardDelete(HttpServletRequest request) throws Exception {
    	
    	String brdno = request.getParameter("brdno");
    	
    	boardSvc.deleteBoardOne(brdno);
        
        return "redirect:/boardList";
    }
*/
}