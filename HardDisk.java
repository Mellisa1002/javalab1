package lab1;

public class HardDisk {
	private int amount;          //Ӳ������
	public String hdType;       //Ӳ������
	HardDisk(){}                           //���췽��1
	HardDisk(int amount,String hdType){    //���췽��2
		this.amount=amount;
		this.hdType=hdType;
	}
	void setAmount(int m){       //�趨Ӳ������
		amount = m;
	}
	int getAmound() {            //��ȡӲ������
		return amount;
	}
	String setHDType(String t) { //���ò��ж�Ӳ��Ʒ���Ƿ���ȷ
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
			hdType="�������һ����ȷ��Ӳ������!";
			return hdType;
		}	
	

}
}
