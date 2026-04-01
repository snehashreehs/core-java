class SnapchatRunner {

    public static void main(String[] args) {

        Snapchat s1 = new Snapchat("indigo_snap", "indigo@snap.com", 66, 6346687983L, true);
        s1.showData();

        Snapchat s2 = new Snapchat("lark_snap", "lark@snap.com", 23, 9753235451L, false);
        s2.showData();

        Snapchat s3 = new Snapchat("orion_snap", "orion@snap.com", 89, 9886554321L, true);
        s3.showData();

        Snapchat s4 = new Snapchat("shanti_snap", "shanti@snap.com", 21, 3254354676L, false);
        s4.showData();

        Snapchat s5 = new Snapchat("harish_snap", "harish@snap.com", 900, 3546576898L, true);
        s5.showData();

        Snapchat s6 = new Snapchat("suresh_snap", "suresh@snap.com", 34, 7843656757L, false);
        s6.showData();

        Snapchat s7 = new Snapchat("rajesh_snap", "rajesh@snap.com", 46, 3435445648L, true);
        s7.showData();
    }
}