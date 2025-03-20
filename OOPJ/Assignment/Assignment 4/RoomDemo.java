class Room{
	int height; 
	int width;
	int breadth;
	Room(int height,int width,int breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	double volume(){
		return height*width*breadth;
	}
}
class RoomDemo{
	public static void main(String[] args){
		Room r= new Room(8,4,6);
		Room r1= new Room(9,3,6);
		System.out.println("Volume of Room 1: " + r.volume() + " cubic units");
		System.out.println("Volume of Room 2: " + r1.volume() + " cubic units");
	}
}