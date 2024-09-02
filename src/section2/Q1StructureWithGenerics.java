package section2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Players {
	int pid;
	String pname;
	int prun;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrun() {
		return prun;
	}

	public void setPrun(int prun) {
		this.prun = prun;
	}

	public Players(int pid, String pname, int prun) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prun = prun;
	}

}

public class Q1StructureWithGenerics {

	public static void main(String[] args) {

		LinkedHashMap<String, Players> hm = new LinkedHashMap<String, Players>();

		hm.put("I001", new Players(1, "Shyam", 50000));
		hm.put("I002", new Players(2, "Ram", 60000));

		LinkedHashMap<String, Players> hm1 = new LinkedHashMap<String, Players>();

		hm1.put("A001", new Players(1, "Steve", 10000));
		hm1.put("A002", new Players(2, "Smith", 20000));

		LinkedHashMap<String, Map<String, Players>> lhm = new LinkedHashMap<String, Map<String, Players>>();

		lhm.put("India", hm);
		lhm.put("Aus", hm1);
		
		Set<Map.Entry<String,Map<String,Players>>> st=lhm.entrySet();
		
		for(Map.Entry<String,Map<String,Players>> gt:st) {
			
			System.out.println(gt.getKey());
			System.out.println("------------------------------------");
			Set<Map.Entry<String, Players>> st1=gt.getValue().entrySet();
			
			for(Map.Entry<String, Players> gt1:st1) {
				System.out.println(gt1.getKey());
				
				Players p=(Players)gt1.getValue();
				System.out.println(p.getPid()+p.getPname()+p.getPrun());
			}
		}

	}

}




