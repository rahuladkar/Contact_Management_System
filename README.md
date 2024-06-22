# Contact_Management_System
Author : Rahul Adkar

# Contact Management System

## Overview

The Contact Management System is a simple console-based application that allows users to manage their contacts. Users can add new contacts, remove existing ones, update contact details, search for specific contacts, and display all contacts.

## Features

- **Add Contact:** Add a new contact with a name, phone number, and email.
- **Remove Contact:** Remove an existing contact by name.
- **Update Contact:** Update the phone number and email of an existing contact.
- **Search Contact:** Search for a contact by name and display their details.
- **Display Contacts:** Display all contacts stored in the system.

## Class Design

### Contact Class

The `Contact` class represents a contact in the system. It has the following attributes:

- `name` (String): The name of the contact.
- `phoneNumber` (String): The contact's phone number.
- `email` (String): The contact's email address.

The `Contact` class includes methods to get and set these attributes, and a method to display the contact information.

### ContactManager Class

The `ContactManager` class manages the list of contacts using an `ArrayList<Contact>`. It includes methods for adding, removing, updating, searching, and displaying contacts.

## Functionality

### Add Contact

- **Input:** User enters the contact's name, phone number, and email.
- **Process:** Create a new `Contact` object and add it to the `ArrayList<Contact>`.
- **Output:** Confirmation message that the contact has been added.

### Remove Contact

- **Input:** User enters the name of the contact to be removed.
- **Process:** Search the `ArrayList<Contact>` for a contact with the given name. If found, remove it.
- **Output:** Confirmation message if the contact is removed, or an error message if the contact is not found.

### Update Contact

- **Input:** User enters the name of the contact to be updated, along with the new phone number and email.
- **Process:** Search the `ArrayList<Contact>` for a contact with the given name. If found, update the phone number and email.
- **Output:** Confirmation message if the contact is updated, or an error message if the contact is not found.

### Search Contact

- **Input:** User enters the name of the contact to search for.
- **Process:** Search the `ArrayList<Contact>` for a contact with the given name.
- **Output:** Display the contact details if found, or an error message if the contact is not found.

### Display All Contacts

- **Process:** Iterate through the `ArrayList<Contact>` and display the details of each contact.
- **Output:** List of all contacts with their details.

## User Interface

The application provides a menu-driven interface for users to interact with the system. The menu options are:

1. Add Contact
2. Remove Contact
3. Update Contact
4. Search Contact
5. Display All Contacts
6. Exit

### Example Workflow

1. **Start Application:**
   - Display the main menu with options: Add Contact, Remove Contact, Update Contact, Search Contact, Display All Contacts, Exit.

2. **Add a Contact:**
   - User selects "Add Contact".
   - User is prompted to enter the name, phone number, and email.
   - The contact is added to the list, and a confirmation message is displayed.

3. **Remove a Contact:**
   - User selects "Remove Contact".
   - User is prompted to enter the name of the contact to be removed.
   - The contact is removed from the list if found, and a confirmation message is displayed.

4. **Update a Contact:**
   - User selects "Update Contact".
   - User is prompted to enter the name of the contact to be updated, and the new phone number and email.
   - The contact details are updated if the contact is found, and a confirmation message is displayed.

5. **Search for a Contact:**
   - User selects "Search Contact".
   - User is prompted to enter the name of the contact to search for.
   - The contact details are displayed if found, or an error message if not found.

6. **Display All Contacts:**
   - User selects "Display All Contacts".
   - All contacts in the list are displayed.

7. **Exit Application:**
   - User selects "Exit".
   - The application terminates.

## Data Validation and Error Handling

- **Validation:**
  - Ensure that the phone number is in a valid format.
  - Ensure that the email address is valid.
  - Prevent adding duplicate contacts (based on name).

- **Error Handling:**
  - Handle cases where the contact to be removed or updated does not exist.
  - Ensure the list is not empty when displaying contacts.

## How to Run

To run the Contact Management System, follow these steps:

1. Compile the Java files:
   ```sh
   javac Contact.java ContactManager.java Main.java
