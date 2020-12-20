package org.springTest.bean;

import java.io.Serializable;
import java.util.List;
import org.springTest.Entity.*;

public class BookPageBean implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    //全ページ数
    private int totalPages;
     
    //現在のページ数
    private int currentPage;
 
    //全レコード数
    private long totalRecords;
 
    //開始レコード番号
    private long startRecords;
 
    //終了レコード番号
    private long endRecords;
 
    //１ページ分のBook情報
    private List<Infomation> books;
 
    //次ページが存在するか
    private boolean hasNextPage;
 
    //前ページが存在するか
    private boolean hasPreviousPage;

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(long totalRecords) {
		this.totalRecords = totalRecords;
	}

	public long getStartRecords() {
		return startRecords;
	}

	public void setStartRecords(long startRecords) {
		this.startRecords = startRecords;
	}

	public long getEndRecords() {
		return endRecords;
	}

	public void setEndRecords(long endRecords) {
		this.endRecords = endRecords;
	}

	public List<Infomation> getBooks() {
		return books;
	}

	public void setBooks(List<Infomation> books) {
		this.books = books;
	}
    
    

}
