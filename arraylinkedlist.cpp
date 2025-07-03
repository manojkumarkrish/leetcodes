#include<iostream>
using namespace std;
class Node
{
	public:
		int data;
		Node *next;
		Node(int val)
		{
			data=val;
			next=nullptr;
		}
};
class QueueLinkedList
{
	private:
		Node *rear;
		Node *front;
	public:
		QueueLinkedList()
		{
			front=rear=nullptr;
		}
		void enqueue(int val)
		{
			Node* newNode = new Node(val);
			if(rear==nullptr)
			{
				rear=front=newNode;
				return;
			}
            rear->next =newNode;
            rear = newNode;
		}
		void dequeue()
		{
			if(front==nullptr)
			{
				cout<<"Queue underflow";
				return;
			}
			Node* temp = front;
            front=front->next;
            if(front==nullptr)
            {
            	rear=nullptr;
			}
            delete temp;
		}
		void peek()
		{
			cout<<front->data;
		}
		void isempty()
		{
			if(front==nullptr)
		        cout<<"yes";
			else
			    cout<<"no";
		}
		void display()
		{
			Node* temp=front;
			while(temp!=nullptr)
			{
				cout<<temp->data<<" -> ";
				temp=temp->next;
			}
			cout<<"Null"<<endl;
		}
		
};
int main()
{
    QueueLinkedList qt;
	qt.isempty();//yes
	qt.enqueue(10);qt.enqueue(20);qt.enqueue(30);qt.enqueue(40);
	qt.display();
	qt.peek();//10
	cout<<endl;
	qt.dequeue();
	qt.display();
	qt.peek();//20
}
