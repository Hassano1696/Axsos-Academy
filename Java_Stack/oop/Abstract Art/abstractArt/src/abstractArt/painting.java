package abstractArt;

public class painting extends art {
	private String paintType;
	
	public painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}

	@Override
	public void view() {
		super.getAuthor();
		// TODO Auto-generated method stub
		System.out.println("Title: "+this.title+"Author: "+this.author+"Description: "+this.description+"Type: "+this.paintType);
	}

}
