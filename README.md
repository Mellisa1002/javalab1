# 陈立男 2019311232 计192 

## java第一次上机实验:PC机模拟程序 
<br>

### 实验目的  

<br>

    1.学习java有关工程、包、类等基本知识。
    2.深入理解体会有关方法、构造方法、属性等知识。
    3.尝试定义属性的修饰符多样化以及类中定义方法操作属性，并深入了解public、private等修饰符的用法。
    4.体会在实际问题解决时，需要增加合理的逻辑判断。
    5.尝试多种不同的对对象属性调用的方法。

<br>


### 实验设计

<br>


    1.按照题目要求，先完成基本的对pc机的模拟，含有CPU、HardDisk、PC三个类，以及最后一个Test类。
    2.在基本完成的基础上，加入CPU的新属性品牌，并加入对CPU品牌和速度的逻辑判断；加入HD的新属性类型，同时有对HD的存储容量和类型的逻辑判断。
    
    
<br>
    
### 核心方法

*CPU类*



```
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

``` 

*HardDisk类*

```
package lab1;

public class HardDisk {
	private int amount;          //硬盘容量
	public String hdType;       //硬盘类型
	HardDisk(){}                           //构造方法1
	HardDisk(int amount,String hdType){    //构造方法2
		this.amount=amount;
		this.hdType=hdType;
	}
	void setAmount(int m){       //设定硬盘容量
		amount = m;
	}
	int getAmound() {            //获取硬盘容量
		return amount;
	}
	String setHDType(String t) { //设置并判断硬盘品牌是否正确
		this.hdType = t ;	
		String SATA=new String("SATA");
		String SCSI=new String("SCSI");
	    String SAS=new String("SAS");
		if (hdType.equals(SATA))
		{
			return hdType;
		}
		else if(hdType.equals(SCSI))
		{
			return hdType;	  
		}
		else if(hdType.equals(SAS))
		{
			return hdType;
		}
		else 
		{
			hdType="这个不是一个正确的硬盘类型!";
			return hdType;
		}	
		}
	}
```

*PC类*

```
package lab1;

public class PC {
	private CPU cpu;                    //cpu属性
	private HardDisk HD;                //HD属性
	
	PC(){}                      //构造方法1
	PC(CPU cpu,HardDisk HD){    //构造方法2
		this.cpu = cpu;
		this.HD = HD;
	}
	void setCPU(CPU c){      
		cpu = c ;
		}
	void setHardDisk(HardDisk h) {
		HD = h ;
		}
	
	void show() {              //屏幕输出
		cpu.getSpeed();
		System.out.println("CPU的品牌为:" + cpu.setBrand(cpu.brand));
		System.out.println("硬盘的容量为:" + HD.getAmound());
		System.out.println("硬盘的类型为:" + HD.setHDType(HD.hdType));
	}

}

```

*Test类*

```
package lab1;

public class Test {
	public static void main(String args[]) {
		CPU cpu=new CPU(2000,"Intel");                     //直接定义CPU HD PC
		HardDisk disk=new HardDisk(512,"SATA");            
		PC pc=new PC();
	
	    cpu.setSpeed(8200); 
	    cpu.setBrand("aMD"); 
	    disk.setAmount(256);
	    
	    pc.setCPU(cpu);
	    pc.setHardDisk(disk);
	    pc.show();
	    
	    cpu.setSpeed(-2200); 
	    cpu.setBrand("Intel"); 
	    disk.setAmount(512);
	    disk.setHDType("disk");
	    
	    pc.setCPU(cpu);
	    pc.setHardDisk(disk);
	    pc.show();
		
	}

}

```

### 实验结果
![](https://github.com/Mellisa1002/javalab1/raw/master/实验结果.png)
### 实验感想
