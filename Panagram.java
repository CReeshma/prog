public class Panagram {

	public static void main(String[] args) {
	
	String str="learn";
	
	int[] a=new int[26];
	for(int i=0;i<26;i++) {
		a[i]=0;
	}
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' ') {
			a[str.charAt(i)-'a']++;
		}
	}
	int temp=0;
	for(int i=0;i<26;i++) {
		if(a[i]==0) {
			temp=1;
			break;
		}
	}
	if(temp!=1) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	}
}