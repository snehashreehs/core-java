class LinkedInRunner {

    public static void main(String[] args) {

        LinkedIn l1 = new LinkedIn("suresh_profile", "suresh.com", 200, 4231111111L, true);
        l1.showProfile();

        LinkedIn l2 = new LinkedIn("arav_profile", "arav@li.com", 700, 6782222222L, false);
        l2.showProfile();

        LinkedIn l3 = new LinkedIn("kabir_profile", "kabir@li.com", 300, 9103333333L, true);
        l3.showProfile();

        LinkedIn l4 = new LinkedIn("myra_profile", "myra@li.com", 400, 8764444444L, false);
        l4.showProfile();

        LinkedIn l5 = new LinkedIn("arjun_profile", "arjun@li.com", 100, 3425555555L, true);
        l5.showProfile();

        LinkedIn l6 = new LinkedIn("ananya_profile", "ananya@li.com", 500, 1236666666L, false);
        l6.showProfile();

        LinkedIn l7 = new LinkedIn("diya_profile", "diya@li.com", 850, 6547777777L, true);
        l7.showProfile();
    }
}