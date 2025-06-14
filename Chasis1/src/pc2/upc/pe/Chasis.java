package pc2.upc.pe;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.io.File;
import web.upc.pe.* ;
public class Chasis {

	public static void main(String[] args) {
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		long start = System.nanoTime();
		Runtime runtime = Runtime.getRuntime();
		int cpus = runtime.availableProcessors();
		long mmax = runtime.maxMemory() / 1024 / 1024;
		long mtotal = runtime.totalMemory() / 1024 / 1024;
		long mfree = runtime.freeMemory() / 1024 / 1024;
		File cDrive = new File("C:");
		double elapseTime = (System.nanoTime() - start) / 1_000_000_000; /// *1.0e-9;
		System.out.println("Datos de JVM");
		System.out.println("CPUS:" + Integer.toString(cpus));
		System.out.println("Memoria Maxima:" + Long.toString(mmax));
		System.out.println("Memoria total:" + Long.toString(mtotal));
		System.out.println("Memoria Libre:" + Long.toString(mfree));
		// 1 s = 1,000 ms = 1,000,000 �s = 1,000,000,000 ns
	
		System.out.println("Tiempo sec:" + Double.toString(elapseTime));
		System.out.println(String.format("Espacio total c: %.2f GB", (double) cDrive.getTotalSpace() / 1073741824));
		Wchasis xo= new Wchasis();
		System.out.println(xo.toString());
	    
	}
}