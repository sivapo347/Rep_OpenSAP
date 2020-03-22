package org.opensap.course;

public class objectInstantiation {

	public static void main(String[] args) {

		class Detective {

			String name = "Bond";

			void DetectiveName() {
				System.out.println("Detective Name : " + name);

			}

			void Number() {

				System.out.println("Detective Number : 007 ");
			}
		}

		Detective myDetective = new Detective(); // object Instantiation
		myDetective.DetectiveName();
		myDetective.Number();

	}

}
