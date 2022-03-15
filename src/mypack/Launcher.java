package mypack;

public class Launcher {
	static LinkNode head=null;

	public static void addafterroll(int rollno, Stud data) {
		LinkNode curr=head;
		while (curr!=null) {
			if (curr.data.rollno==rollno) {
				LinkNode newnode=new LinkNode(data);
				newnode.next=curr.next;
				curr.next=newnode;
				break;
			} 
			curr=curr.next;
		}
		if (curr==null)
			System.out.println("Invalid rollno "+rollno);
	}
	
	public static void addbeforeroll(int rollno, Stud data) {
		LinkNode curr=head;
		if (curr.data.rollno==rollno)
			addBeg(data);
		else
		while (curr.next!=null) {
			if (curr.next.data.rollno==rollno) {
				LinkNode newnode=new LinkNode(data);
				newnode.next=curr.next;
				curr.next=newnode;
				break;
			} 
			curr=curr.next;
		}
		if (curr.next==null)
			System.out.println("Invalid rollno "+rollno);
	}
	
	public static void addEnd(Stud data) {
		if (head==null)
			head=new LinkNode(data);
		else {
			LinkNode c=head;
			while (c.next!=null) 
				c=c.next;
			c.next=new LinkNode(data);
		}
	}
	
	public static void addBeg(Stud data) {
		if (head==null)
			head=new LinkNode(data);
		else {
			LinkNode c=new LinkNode(data);
			c.next=head;
			head=c;
		}
	}
	
	public static void deleteroll(int rollno) {
		LinkNode curr=head;
		if (curr.data.rollno==rollno)
			head=head.next;
		else
		while (curr.next!=null) {
			if (curr.next.data.rollno==rollno) {
				curr.next=curr.next.next;
				break;
			} 
			curr=curr.next;
		}
		if (curr==null)
			System.out.println("Invalid rollno "+rollno);
	}
	
	public static void main(String[] args) {
		addEnd(new Stud(13,"Anita"));
		addEnd(new Stud(14,"Anil"));
		addEnd(new Stud(15,"Sima"));
		addBeg(new Stud(10,"Ansh"));
		//addbeforeroll(14,new Stud(13,"Anjum"));
		deleteroll(15);
		/*LinkNode head=new LinkNode(new Stud(13,"Anita"));
		head.next=new LinkNode(new Stud(14,"Parvati"));
		head.next.next=new LinkNode(new Stud(15,"Puneet"));
		*/
		LinkNode c=head;
		while (c!=null) {
			System.out.println(c.data);
			c=c.next;
		}	
	}

	public static int compute(int a,int b) {
		if (a>b)
			return a*2+b;
		else
			return b*2+a;
	}
	
}
