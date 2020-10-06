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
