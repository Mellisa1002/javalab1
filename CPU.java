package lab1;

public class CPU {
	private int speed;        //�ٶ�
	public String brand;      //Ʒ��
	CPU(){}                           //���췽��1
	CPU(int speed , String brand){    //���췽��2
		this.speed = speed;
		this.brand = brand;		
	}
	void setSpeed(int m) {//����cpu�ٶ�
			speed = m ;	
	}
	int getSpeed() {             //��ȡcpu�ٶ�
		if(speed<=0) {
			System.out.println("cpu���ٶ�����." );
			return speed;
		}
		else {	
		System.out.println("CPU���ٶ�Ϊ:" + speed);
		return speed;
		}
	}
	String setBrand(String b) {  //�ж�cpuƷ���Ƿ���ȷ
		this.brand = b ;	
		String intel=new String("Intel");
		String cnintel=new String("Ӣ�ض�");
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
			brand="�������CPUƷ��Ŷ!";
			return brand;
		}			
		
	}

}
