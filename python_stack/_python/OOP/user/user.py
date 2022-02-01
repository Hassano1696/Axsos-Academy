class User:		
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account_balance = 0
    def make_deposit(self, amount):
        self.account_balance += amount
    def make_withdrawal(self, amount):	
        self.account_balance -= amount
    def  Transfer(self, anotheruser, amount) :
        self.account_balance -= amount
        anotheruser.account_balance += amount
    def display_user_balance(self):
        print('User:',self.name,',','Balance:',self.account_balance,'$')
RJ = User('Ramos Jerry','dijegoeg@gmai.com')
Mike = User('Mike Jordan','cflkgdhildjfg@facebook.com')
Nafez= User('Nafez Mahfouz','fdbdojg@cuw.com')
RJ.make_deposit(200)
RJ.make_deposit(300)
RJ.make_deposit(20000)
RJ.make_withdrawal(19500)
RJ.display_user_balance()
Mike.make_deposit(200)
Mike.make_deposit(50)
Mike.make_withdrawal(120)
Mike.make_withdrawal(80)
Mike.display_user_balance()
Nafez.make_deposit(2000)
Nafez.make_withdrawal(70)
Nafez.make_withdrawal(150)
Nafez.make_withdrawal(400)
Nafez.display_user_balance()
RJ.Transfer(Nafez, 200)
RJ.display_user_balance()
