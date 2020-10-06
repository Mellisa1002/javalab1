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
