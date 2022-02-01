class  BankAccount:	
    def __init__(self,int_rate, balance):
        self.int_rate= int_rate
        self.balance = balance
class User:		
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account = BankAccount(int_rate=0.02, balance=0)
    def make_deposit(self, amount):
        self.account.balance += amount
        return self
    def make_withdrawal(self, amount):	
        if self.account.balance < amount:
            print('Insufficient funds: Charging a $5 fee')
            self.account.balance -=5
            return self
        self.account.balance -= amount
        return self
    def yield_interest(self):
        if self.account.balance > 0:
            self.account.balance=(self.account.balance * self.account.int_rate)+ self.account.balance
        return self
    def display_user_balance(self):
        print('User:',self.name,',',self.account.balance,'$')
    def new_account (self):
        self.account.BankAccount(int_rate=0.02, balance=0)
        return self
RJ = User('Ramos Jerry','dijegoeg@gmai.com')
Mike = User('Mike Jordan','cflkgdhildjfg@facebook.com')
Nafez= User('Nafez Mahfouz','fdbdojg@cuw.com')
RJ.make_deposit(500).make_deposit(1500).display_user_balance()
RJ.make_withdrawal(800).display_user_balance()
