class User:		
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account_balance = 0
    def make_deposit(self, amount):
        self.account_balance += amount
        print('User:',self.name,',','Balance:',self.account_balance,'$')
    def make_withdrawal(self, amount):	
        self.account_balance -= amount
        print('User:',self.name,',','Balance:',self.account_balance,'$')
    def  Transfer(self, anotheruser, amount) :
        self.account_balance -= amount
        anotheruser.account_balance += amount
        print('User:',self.name,',','Balance:',self.account_balance,'$')
        print('User:',anotheruser.name,',','Balance:',anotheruser.account_balance,'$')
    def display_user_balance(self):
        print('User:',self.name,',','Balance:',self.account_balance,'$')
RJ = User('Ramos Jerry','dijegoeg@gmai.com')
Mike = User('Mike Jordan','cflkgdhildjfg@facebook.com')
Nafez= User('Nafez Mahfouz','fdbdojg@cuw.com')

