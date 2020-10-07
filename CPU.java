package lab1;

public class CPU {
	private int speed;        //速度
	public String brand;      //品牌
	CPU(){}                           //构造方法1
	CPU(int speed , String brand){    //构造方法2
		this.speed = speed;
		this.brand = brand;		
	}
	void setSpeed(int m) {//设置cpu速度
			speed = m ;	
	}
	int getSpeed() {             //获取cpu速度
		if(speed<=0) {
			System.out.println("cpu的速度有误." );
			return speed;
		}
		else {	
		System.out.println("CPU的速度为:" + speed);
		return speed;
		}
	}
	String setBrand(String b) {  //判断cpu品牌是否正确
		this.brand = b ;	
		String intel=new String("Intel");
		String cnintel=new String("英特尔");
	    String amd=new String("AMD");
		if (brand.equals(intel))
		{
			return brand;
		}
		else if(brand.equals(cnintel))
		{
			return brand;	  
		}
		else if(brand.equals(amd))
		{
			return brand;
		}
		else 
		{
			brand="这个不是CPU品牌哦!";
			return brand;
		}			
		
	}

}
