package bitedu.bipa.member.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import bitedu.bipa.member.vo.BookCopy;

public class QuizService {
	
	private ArrayList<BookCopy> list;
	public QuizService() {
		list = new ArrayList<BookCopy>();
		list.add(new BookCopy(1,"PM0000037903","슬픈 세상의 기쁜 말 : 당신을 살아 있게 하는 말은 무엇입니까","정혜윤 지음",new Timestamp(new Date(2021-1900,12,23).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(2,"PM0000037904","유창한 영어회화를 꼭 원하는 분. 1 Fluent English","강성구 지음",new Timestamp(new Date(2023-1900,1,28).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(3,"PM0000037905","도둑맞은 뇌 : 뇌과학이 발견한 기억의 7가지 오류","대니얼 샥터 지음 ; 홍보람 옮김",new Timestamp(new Date(2023-1900,9,8).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(4,"PM0000037903","슬픈 세상의 기쁜 말 : 당신을 살아 있게 하는 말은 무엇입니까","정혜윤 지음",new Timestamp(new Date(2021-1900,12,23).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(5,"PM0000037904","유창한 영어회화를 꼭 원하는 분. 1 Fluent English","강성구 지음",new Timestamp(new Date(2023-1900,1,28).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(6,"PM0000037905","도둑맞은 뇌 : 뇌과학이 발견한 기억의 7가지 오류","대니얼 샥터 지음 ; 홍보람 옮김",new Timestamp(new Date(2023-1900,9,8).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(7,"PM0000037903","슬픈 세상의 기쁜 말 : 당신을 살아 있게 하는 말은 무엇입니까","정혜윤 지음",new Timestamp(new Date(2021-1900,12,23).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(8,"PM0000037904","유창한 영어회화를 꼭 원하는 분. 1 Fluent English","강성구 지음",new Timestamp(new Date(2023-1900,1,28).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(9,"PM0000037905","도둑맞은 뇌 : 뇌과학이 발견한 기억의 7가지 오류","대니얼 샥터 지음 ; 홍보람 옮김",new Timestamp(new Date(2023-1900,9,8).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(10,"PM0000037903","슬픈 세상의 기쁜 말 : 당신을 살아 있게 하는 말은 무엇입니까","정혜윤 지음",new Timestamp(new Date(2021-1900,12,23).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(12,"PM0000037904","유창한 영어회화를 꼭 원하는 분. 1 Fluent English","강성구 지음",new Timestamp(new Date(2023-1900,1,28).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(13,"PM0000037905","도둑맞은 뇌 : 뇌과학이 발견한 기억의 7가지 오류","대니얼 샥터 지음 ; 홍보람 옮김",new Timestamp(new Date(2023-1900,9,8).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(14,"PM0000037903","슬픈 세상의 기쁜 말 : 당신을 살아 있게 하는 말은 무엇입니까","정혜윤 지음",new Timestamp(new Date(2021-1900,12,23).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(15,"PM0000037904","유창한 영어회화를 꼭 원하는 분. 1 Fluent English","강성구 지음",new Timestamp(new Date(2023-1900,1,28).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(16,"PM0000037905","도둑맞은 뇌 : 뇌과학이 발견한 기억의 7가지 오류","대니얼 샥터 지음 ; 홍보람 옮김",new Timestamp(new Date(2023-1900,9,8).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(17,"PM0000037903","슬픈 세상의 기쁜 말 : 당신을 살아 있게 하는 말은 무엇입니까","정혜윤 지음",new Timestamp(new Date(2021-1900,12,23).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(18,"PM0000037904","유창한 영어회화를 꼭 원하는 분. 1 Fluent English","강성구 지음",new Timestamp(new Date(2023-1900,1,28).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(19,"PM0000037905","도둑맞은 뇌 : 뇌과학이 발견한 기억의 7가지 오류","대니얼 샥터 지음 ; 홍보람 옮김",new Timestamp(new Date(2023-1900,9,8).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(20,"PM0000037903","슬픈 세상의 기쁜 말 : 당신을 살아 있게 하는 말은 무엇입니까","정혜윤 지음",new Timestamp(new Date(2021-1900,12,23).getTime()),"BS-0001","BM-0001"));
		list.add(new BookCopy(21,"PM0000037904","유창한 영어회화를 꼭 원하는 분. 1 Fluent English","강성구 지음",new Timestamp(new Date(2023-1900,1,28).getTime()),"BS-0001","BM-0001"));
	

	}
	
	public boolean checkId(String id) {
		boolean flag = false;
		if(id.equals("admin")) {
			flag = true;
		}
		return flag;
	}
	
	public boolean registBook(BookCopy copy) {
		boolean flag = false;
		copy.setBookSeq(list.size()+1);
		copy.setBookPosition("BS-0001");
		copy.setBookStaus("BM-0001");
		list.add(copy);
		return flag;
	}
	
	public ArrayList<BookCopy> searchBookAll(){
		
		return this.list;
	}
	public boolean removeBook(String bookSeq) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int index = -1;
		for(int i=0;i<list.size();i++) {
			BookCopy copy = list.get(i);
			if(copy.getBookSeq()==Integer.parseInt(bookSeq)) {
				index = i;
				flag = true;
				break;
			}
		}
		list.remove(index);
		return flag;
	}
	public BookCopy findBook(String bookSeq) {
		BookCopy copy = null;
		for(int i=0;i<list.size();i++) {
			copy = list.get(i);
			if(copy.getBookSeq()==Integer.parseInt(bookSeq)) {
				break;
			} else {
				copy = null;
			}
		}
		System.out.println(copy);
		return copy;
	}
	public boolean modifyBook(BookCopy copy) {
		// TODO Auto-generated method stub
		boolean flag = false;
		BookCopy book = null;
		for(int i=0;i<list.size();i++) {
			book = list.get(i);
			if(book.getBookSeq()==copy.getBookSeq()) {
				list.set(i, copy);
				flag = true;
			} 
		}
		return flag;
	}
	
	
	
	
}
