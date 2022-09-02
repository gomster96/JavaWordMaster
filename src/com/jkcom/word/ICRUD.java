package com.jkcom.word;

public interface ICRUD {
	public Object add();
	public void addWord();
	public int update(Object obj);
	public int delete(Object obj);
	public void selectOne(int id);
	public void listAll();
}
