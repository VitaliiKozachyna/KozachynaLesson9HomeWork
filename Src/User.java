public class User {
    private String login;
    Account account;

    User(String login, String password) {
        this.login = login;
        this.account = new Account(password);
    }

    class Account{
        private String password;

        public Account(String password) {
            this.password = password;
        }

        void displayAccount(){
            System.out.printf("Аккаунт успішно залогінився. Логін: %s, пароль: %s", login, password);
        }
    }
}
