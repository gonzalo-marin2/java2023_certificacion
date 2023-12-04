package pruebas;

public class TestSalidasForzadas {

	public static void main(String[] args) {
		int[] nums= {6,2,8,11};
		var index=0;
		for(int i:nums) {
			if(index==0) {
				break;
			}else {
				continue;
			}
			//System.out.println(nums[index]); //Error de compilación: unreacheable code
		}

	}

}
