package com.resonentia.inheritance.oops;



	
	class Product {
		 int id;
		String pname;
		protected int version;
	    private int dom;
	
		void setdata(int version, int dom) {
			this.version = version;
			this.dom = dom;
	
		}
	
		void setdata(int id, String pname, String sname, int price, int version, int dom) {
			// TODO Auto-generated method stub
			
		}

		void getdata() {
			System.out.println("version is:====" + version + "====");
			System.out.println("date of manufacturing is:" + dom);
	
		}
	
	}
	
	class Mobile extends Product {
		String sname;
		int price;
	
		// method overloading : same method name with different inputs. if remove super.
		@Override
	 void setdata (int id, String pname, String sname, int price, int version, int dom) {
			super.setdata(version, dom);
			this.id = id;
			this.pname = pname;
			this.sname = sname;
			this.price = price;
		}
	
		// here child method will be executed not the parent method if remove super.
		// hence this called as method overriding....
		void getdata() {
			super.getdata();
			System.out.println("product is id===" + id + "=====");
			System.out.println("product name is " + pname);
			System.out.println("soap name is " + sname);
			System.out.println("price is " + price);
		}
	
	}
	public class Inher {
	
		public static void main(String[] args) {
			Mobile m = new Mobile();
			m.setdata(2, "soap", "cinthol", 10, 5, 2018);
			m.getdata();
	
		}
	
	}

	

