package com.pluralsight;

/* Nouns from workbook description:

Guest

Clerk / Front Desk / Reception

Room

Room Key

Receipt

Room Service

Restaurant

Meal

Housekeeping

Maintenance

Request / Service Request

Towels / Supplies

Light Bulb / Maintenance Issue

Check-in / Check-out Process
| **Category**            |
| ----------------------- |
| **People / Roles**      |
| **Physical Entities**   |
| **Processes / Actions** |
| **Services / Requests** |
| **Documents / Records** |

 **Objects / Classes**                                           | **Responsibilities / Attributes**                                  |
 --------------------------------------------------------------- | ------------------------------------------------------------------ |
 `Guest`, `Clerk`, `Housekeeper`, `MaintenanceStaff`, `Manager`  | name, employeeID, phone, role, assigned tasks                      |
 `Room`, `RoomKey`, `Hotel`, `Restaurant`, `Meal`, `Order`       | roomNumber, type, status (available, occupied), price, order items |
 `CheckIn`, `CheckOut`, `Payment`, `Reservation`                 | dates, guest info, room assigned, total charge                     |
 `RoomServiceOrder`, `MaintenanceRequest`, `HousekeepingRequest` | requestType, description, status, assignedTo                       |
 `Receipt`, `Invoice`, `BookingRecord`                           | amount, guestID, dates, services used                              |

 */


