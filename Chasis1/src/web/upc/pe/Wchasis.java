package web.upc.pe;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class Wchasis {
	public String cpus;
	public String mmax;
	public String mtotal;
	public String mlibre;
	public String tiempo;
	public String espacio;

	public Wchasis() {
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		long start = System.nanoTime();
		Runtime runtime = Runtime.getRuntime();
		int cpus = runtime.availableProcessors();
		long mmax = runtime.maxMemory() / 1024 / 1024;
		long mtotal = runtime.totalMemory() / 1024 / 1024;
		long mfree = runtime.freeMemory() / 1024 / 1024;
		File cDrive = new File("C:");
		double elapseTime = (System.nanoTime() - start) / 1_000_000_000; /// *1.0e-9;
		this.cpus = Integer.toString(cpus);
		this.mmax = Long.toString(mmax);
		this.mtotal =Long.toString(mtotal);
		this.mlibre=Long.toString(mfree);
		this.tiempo=Double.toString(elapseTime);
		this.espacio=String.format("Espacio total c: %.2f GB", (double) cDrive.getTotalSpace() / 1073741824);
		
		
		
		
	}

	@Override
	public String toString() {
		return "Wchasis [cpus=" + cpus + ", mmax=" + mmax + ", mtotal=" + mtotal + ", mlibre=" + mlibre + ", tiempo="
				+ tiempo + ", espacio=" + espacio + "]";
	}

}
