package Final;

class SocialMedia2 {
    String name;
}

class Instagram extends SocialMedia2 {
    final void login (String username, String password) {

    }
}

// class FakeInstagram extends Instagram {
//     void login (String username, String password) {  ----> error because we can't override FINAL method in child class
//     }
// }
