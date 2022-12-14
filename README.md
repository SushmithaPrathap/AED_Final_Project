Hospital Management System:

A "Hospital Management System” is an electronically programmed enterprise solution to manage the day to day activities of a hospital. This management system was created to function as a whole, comprising Employees, Doctors (consultants), Nurses, Patients, Bills, and Complaints, among other things. Employees, physicians, patients, and accounts will all be tracked by the suggested system, which will also produce reports outlining the current state. Through several user-friendly menu-driven modules, this project's GUI-based software will assist in storing, updating, and retrieving the information.

Some of the objectives of this project are, 

Maintaining admission records of patients.
Scheduling appointments for Patients with Doctors (Consultants)
Maintaining records of the Pharmacy department in a meticulously arranged order so that inventory can be managed easily. 
Creating and maintaining details about the consultants, their Prescriptions and treatments, surgery reports etc.
Listing laboratory facilities and diagnostic tools for Treatments. 
Keeping explicit details about the patient’s diseases, diagnosis and management for comprehensive research.

The hospital management system that we created can be made specific to each city or a geographical location. Each hospital management system will have a number of enterprise entities, namely: Hospital, Pharmacy, Lab and Insurance. Each of these enterprises have their organizations set up with the following individual entities: Administration, Billing, Doctor Profiles, Insurance Management, Lab management and Inventory Management. In order for these entities to function as an independent part of the system, we have mapped a workflow to be followed. For each organizational entity to perform a certain task, first a Work Request need to be put in which will be queued in a Work Queue. The type of Work Request can be anything related to the organizational aspect such as Lab Work, Doctor Work, or Insurance Work. Like any other Enterprise, each organization will have its own employees working under it. For example, The Lab Management Organization will have Lab Employees, the Pharmacy Management Organization will have Pharmacy Employees, etc. 

Each Organization will contain multiple user accounts that are mapped to it. Each user account of the organization will have a role type. Users can take upon many roles such as AdminRole, DoctorRole, InsuranceRole, Lab Technician, etc. Users can also be Nurses, Patients and Receptionists.