package edu.umbc.cs.ebiquity.mithril.ebxprivacy;

import edu.umbc.cs.ebiquity.mithril.ebxprivacy.PRestriction;
import edu.umbc.cs.ebiquity.mithril.ebxprivacy.PSetting;

interface IPrivacyService {
	int getVersion();
	List /* String */ check();
	boolean databaseCorrupt();
	void reportError(String message);
	Map getStatistics();

	void setRestriction(in PRestriction restriction);
	void setRestrictionList(in List<PRestriction> listRestriction);
	PRestriction getRestriction(in PRestriction restriction, boolean usage, String secret);
	List<PRestriction> getRestrictionList(in PRestriction selector);
	boolean isRestrictionSet(in PRestriction restriction);
	void deleteRestrictions(int uid, String restrictionName);

	long getUsage(in List<PRestriction> restriction);
	List<PRestriction> getUsageList(int uid, String restrictionName);
	void deleteUsage(int uid);

	void setSetting(in PSetting setting);
	void setSettingList(in List<PSetting> listSetting);
	PSetting getSetting(in PSetting setting);
	List<PSetting> getSettingList(in PSetting selector);
	void deleteSettings(int uid);

	void clear();
	void flush();
	void dump(int uid);
}
