package oops;
interface whatsappcalls
{
	void mute();
	void calls();
	void disconnect();
}

class audiocall implements whatsappcalls
{

	@Override
	public void mute() {
		System.out.println("mute option is present");
		
	}

	@Override
	public void calls() {
		System.out.println("calls option is present");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect option is present");
		
	}
}
	
	class videocall implements whatsappcalls
	{

		@Override
		public void mute() {
			System.out.println("mute option is present in this");
			
		}

		@Override
		public void calls() {
			System.out.println("calls option is present in this");
			
		}

		@Override
		public void disconnect() {
			System.out.println("disconnect option is present in this");
		}
		
	}
	




public class Interffacepgm {

	public static void main(String[] args) {
	whatsappcalls obj=new audiocall();
	obj.mute();
	obj.calls();
	obj.disconnect();
	System.out.println();
	obj=new videocall();
	obj.mute();
	obj.calls();
	obj.disconnect();

		
		
	}

}
