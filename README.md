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
<br>
<br>

### 实验设计

<br>


    1.按照题目要求，先完成基本的对pc机的模拟，含有CPU、HardDisk、PC三个类，以及最后一个Test类。
    2.在基本完成的基础上，加入CPU的新属性品牌，并加入对CPU品牌和速度的逻辑判断；加入HD的新属性类型，同时有对HD的存储容量和类型的逻辑判断。
    
    
<br>
    
### 核心方法

CPU类
****


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

### 实验结果
### 实验感想
