package CreationalPatterns.Prototype;

import java.util.Hashtable;

public class UnitPrototypesCache {

	private static Hashtable<String, Unit> unitCache = new Hashtable<String, Unit>();

	public static Unit getUnit(String unitId) {
		Unit cachedUnit = unitCache.get(unitId);
		return (Unit) cachedUnit.clone();
	}

	public static void setCache() {
		unitCache.put("0", new Infantry());
		unitCache.put("1", new Archer());
		unitCache.put("2", new Knight());
	}
}
