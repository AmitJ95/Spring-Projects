package com.file.task.payload;

public class Response {

	private String fileName;
	//private String fileDownloadUri;
	private String fileType;
	private long size;
	private String id;
    private String message;
	public Response(String fileName, String fileType, long size,String id) {
		super();
		this.fileName = fileName;
		this.fileType = fileType;
		this.size = size;
		this.id = id;
	}

	public Response(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
