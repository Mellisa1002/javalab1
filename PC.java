package lab1;

public class PC {
	private CPU cpu;                    //cpu����
	private HardDisk HD;                //HD����
	
	PC(){}                      //���췽��1
	PC(CPU cpu,HardDisk HD){    //���췽��2
		this.cpu = cpu;
		this.HD = HD;
	}
	void setCPU(CPU c){      
		cpu = c ;
		}
	void setHardDisk(HardDisk h) {
		HD = h ;
		}
	
	void show() {              //��Ļ���
		cpu.getSpeed();
		System.out.println("CPU��Ʒ��Ϊ:" + cpu.setBrand(cpu.brand));
		System.out.println("Ӳ�̵�����Ϊ:" + HD.getAmound());
		System.out.println("Ӳ�̵�����Ϊ:" + HD.setHDType(HD.hdType));
	}

}
