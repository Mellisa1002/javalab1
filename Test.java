package lab1;
import lab1.*;
public class Test {
	public static void main(String args[]) {
		CPU cpu=new CPU(2000,"Intel");                     //ֱ�Ӷ���CPU HD PC
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
	    
	    pc.setCPU(cpu);
	    pc.setHardDisk(disk);
	    pc.show();
		
	}

}
