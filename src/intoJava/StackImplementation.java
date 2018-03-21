import java.util.*;

public class StackImplementation{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter the size of stack");
		int a = sc.nextInt();
		
		Stack stack = new Stack(a);
		
		do{
			System.out.println("1.Check empty");
			System.out.println("2. Check full");
			System.out.println("3.Enter value in stack");
			System.out.println("4.Delete value from Stack");
			System.out.println("5.Get size of stack");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			
			switch(choice){
			case 1:
				System.out.println("Stack status " +stack.isEmpty());
				break;
			case 2:
				System.out.println("Stack Status = " +stack.isFull());
				break;
			case 3:
				try{
					stack.push(sc.nextInt());
				}
				catch (Exception e){
					System.out.println("error " +e.getMessage());
				}
				break;
			case 4:
				try{
					stack.pop();
				}
				catch(Exception e){
					System.out.println("error " +e.getMessage());
				}
				break;
			case 5:
				System.out.println("Size of stack is " +stack.getSize());
				default:
					System.out.println("wrong input");
			}
			System.out.println("Do you want to continue, type y/n");
			ch = sc.next().charAt(0);
			
			
		}
		while(ch == 'Y' || ch == 'y');
	}
}

class Stack{
	protected int arr[];
	protected int len, top, size;
	
	public Stack(int n){
		
		size = n;
		len = 0;
		top = -1;
		arr = new int[size];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == size-1;
	}
	
	public int getSize(){
		
		return len;
	}
	
	public int peek(){
		if(isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		
		return arr[top];
	}
	
	public void push(int i){
		
		if(top+1 > size){
			throw new IndexOutOfBoundsException("Overflow Expception");
		}
		if(top+1 < size){
			arr[top++] = i;
			len++;
		}
		}
		
		public int pop(){
			if(top == 0)
				throw new NoSuchElementException("Underflow Exception");
			len--;
			return arr[top--];	
			}
		
		public void display(){
			if(isEmpty()){
				System.out.println("empty stack");
			}
			
			for(int i = top; i >=0; i++){
				System.out.println("stack = " +arr[i]);
			}
			
		}
		
		
	}

