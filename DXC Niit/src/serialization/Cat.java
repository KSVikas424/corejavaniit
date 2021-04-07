package serialization;

public class Cat implements java.io.Serializable {

	transient int cat1 = 30;
	int cat2 = 40;
}
