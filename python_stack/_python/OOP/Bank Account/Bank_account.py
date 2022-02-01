class  BankAccount:	
    def __init__(self,int_rate=0.05, balance=0):
        self.int_rate= int_rate
        self.balance = balance
    def deposit(self, amount):
        self.balance += amount
        return self
    def withdrawal(self, amount):	
        self.balance -= amount
        if self.balance < amount:
            print('Insufficient funds: Charging a $5 fee')
            self.balance -=5
        return self
    def yield_interest(self):
        if self.balance > 0:
            self.balance=(self.balance * self.int_rate)+self.balance
        return self
    def display_account_info(self):
        print('Balance:',self.balance,'$')
        return self
RJ =  BankAccount(.05,200)
Nafez =  BankAccount(.03,40000)
hassan=BankAccount(balance=400)
RJ.deposit(20).deposit(300).deposit(120).withdrawal(240).yield_interest().display_account_info()
Nafez.deposit(100).deposit(500).withdrawal(100).withdrawal(400).withdrawal(100).withdrawal(200).yield_interest().display_account_info()
hassan.deposit(100).display_account_info()