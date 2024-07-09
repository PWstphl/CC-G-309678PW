package dreieck;

public class dreieck {

	/*public static void main(String[] args) {
		
		
		for (int n = 1; n < 6; n++) {
			System.out.println((n * (n + 1)) /2);
	*///	}

	//}for (int j = 0; j < spaces; j++) {

//} int leerzeichen = max - i;
public static void main(String[] args) {
    int max = 5;
    int sum = 0;

    for (int i = 1; i <= max; i++) {
        sum += i;
        for (int j = 1; j <= i; j++) {
            if (j == 1) {
                System.out.print(j);
            } else {
                System.out.print(" + " + j);
            }
        }
        System.out.println(" = " + sum);
    }
}
}


/*	public static void main(String[] args) {

int sum = 0;
int max = 5;

for (int i = 1; i <= max; i++) {

	sum += i;

	for (int j = 1; j <= i; j++) {
		if (j == 1) {
			System.out.print(+j);
		} else {
			System.out.print(" + " + j);
		}
	}
	System.out.println(" = " + sum);

	// for (int j = 0; j < spaces; j++) {
}
}
}*/