# JobTrack AI — AI-Powered Job Application & Career Management Platform

JobTrack AI is a full-stack web application designed to help job seekers manage their complete job search journey from a single platform.

The application provides job application tracking, AI-powered resume analysis, job matching, resume building, interview tracking, analytics, and personalized application management.

The system is built using **React.js for the frontend** and **Java Spring Boot for the backend**, with **MySQL** for persistent data storage and the **OpenAI API** for AI-powered resume analysis.

This repository contains the **Spring Boot backend** of the JobTrack AI application.

---

## 🚀 Live Application

**Live Demo:**

https://jobtrack-ai-frontend.vercel.app/

**Production Backend API:**

https://jobtrack-ai-backend-production.up.railway.app/

---

## 🔗 Project Repositories

### Frontend Repository

https://github.com/Rakhi1018/jobtrack-ai-frontend

### Backend Repository

https://github.com/Rakhi1018/jobtrack-ai-backend

---

# 📌 Modules

JobTrack AI contains the following major modules:

1. Dashboard
2. Job Application Management
3. AI Resume Analyzer
4. Job Matcher
5. Resume Builder
6. Interview Tracking
7. Analytics
8. Settings

---

# 📊 1. Dashboard

The Dashboard provides a centralized overview of the user's job search activity.

### Features

- Total job applications
- Interview count
- Assessment tracking
- Offer tracking
- Rejected application count
- Application pipeline
- Recent applications
- Quick action shortcuts
- Resume ATS score
- Dynamic dashboard statistics
- Application progress overview

### Dashboard Flow

```text
Job Applications
       ↓
Spring Boot Backend
       ↓
MySQL Database
       ↓
Application Statistics
       ↓
React Dashboard
```

The dashboard retrieves application information from the backend and presents summarized job-search statistics.

---

# 💼 2. Job Application Management

The Job Application module allows users to manage their applications throughout the recruitment process.

### Features

- Add new job applications
- Store company information
- Store job title
- Store application details
- Store job descriptions
- Update application status
- Delete applications
- Search applications
- Track application progress
- Persist application information in MySQL
- Automatically update dashboard statistics

### Application Lifecycle

```text
Applied
   ↓
Assessment
   ↓
Interview
   ↓
Offer
```

Applications can also be moved to:

```text
Rejected
```

### CRUD Operations

```text
Create
  ↓
Read
  ↓
Update
  ↓
Delete
```

These operations are implemented through Spring Boot REST APIs and Spring Data JPA.

---

# 🤖 3. AI Resume Analyzer

The AI Resume Analyzer is one of the core features of JobTrack AI.

It allows users to analyze their resume against a specific job description and receive AI-generated feedback.

### Supported Resume Formats

- PDF
- DOCX
- TXT
- Pasted resume text

### Features

- Resume upload
- Resume text extraction
- Job description input
- Resume-to-job analysis
- AI-powered ATS analysis
- ATS match score
- Matched skills
- Missing skills
- Relevant experience
- Resume strengths
- Resume weaknesses
- Improvement suggestions
- Important job-specific keywords

### AI Analysis Flow

```text
Resume
   +
Job Description
       ↓
React.js Frontend
       ↓
Spring Boot
       ↓
AI Service
       ↓
OpenAI API
       ↓
AI Generated Analysis
       ↓
Spring Boot
       ↓
React.js Frontend
```

### AI Analysis Output

```text
ATS Match Score
       ↓
Matched Skills
       ↓
Missing Skills
       ↓
Relevant Experience
       ↓
Resume Strengths
       ↓
Resume Weaknesses
       ↓
Improvement Suggestions
       ↓
Important Keywords
```

The OpenAI API key is stored securely on the backend using an environment variable.

---

# 🎯 4. Job Matcher

The Job Matcher helps users compare their resume with a target job description.

### Features

- Resume and job description comparison
- Skill matching
- Missing skill identification
- Job match percentage
- Target job analysis
- Load job descriptions from tracked applications
- Identify areas that need improvement

### Matching Flow

```text
Resume
   +
Job Description
       ↓
Keyword / Skill Analysis
       ↓
Matched Skills
       +
Missing Skills
       ↓
Match Percentage
```

The Job Matcher helps users understand how closely their current resume aligns with a particular job opportunity.

---

# 📄 5. Resume Builder

The Resume Builder allows users to create a professional resume directly within the application.

### Sections

- Personal Details
- Professional Summary
- Technical Skills
- Education
- Projects
- Training
- Achievements
- Additional Information

### Features

- Live resume preview
- A4 resume layout
- Professional formatting
- Editable resume sections
- Print-ready resume
- PDF generation through browser print functionality
- Clickable contact information
- Clean ATS-friendly structure

### Resume Builder Flow

```text
User Details
     ↓
Resume Sections
     ↓
Live Preview
     ↓
Professional Resume
     ↓
Print / Save as PDF
```

---

# 🎤 6. Interview Tracking

The Interview module helps users manage applications that reach assessment or interview stages.

### Features

- Track assessment applications
- Track interview applications
- View application information
- Interview preparation access
- Resume checking
- Job matching
- Application status tracking

### Interview Flow

```text
Job Application
       ↓
Assessment
       ↓
Interview
       ↓
Offer / Rejection
```

The module helps users keep track of important recruitment stages without leaving the application.

---

# 📈 7. Analytics

The Analytics module provides a visual overview of job search performance.

### Metrics

- Total Applications
- Interview Rate
- Offers
- Rejected Applications
- Application Performance
- Tracked Companies

### Analytics Flow

```text
Application Data
       ↓
Backend
       ↓
Data Aggregation
       ↓
Analytics
       ↓
React Dashboard
```

Analytics helps users understand their application performance and recruitment progress.

---

# ⚙️ 8. Settings

The Settings module provides basic application preferences.

### Features

- Email notification toggle
- Dark mode
- Persistent user preferences

Settings are stored locally where applicable using browser storage.

---

# 🏗️ Complete System Architecture

```text
                         JOBTRACK AI
                              |
                              ▼
                    ┌──────────────────┐
                    │    React.js      │
                    │     Frontend     │
                    │      Vercel      │
                    └────────┬─────────┘
                             |
                        HTTPS / REST API
                             |
                             ▼
                    ┌──────────────────┐
                    │   Spring Boot    │
                    │     Backend      │
                    │     Railway      │
                    └────────┬─────────┘
                             |
              ┌──────────────┼──────────────┐
              |              |              |
              ▼              ▼              ▼
        ┌──────────┐   ┌───────────┐  ┌────────────┐
        │  MySQL   │   │  OpenAI   │  │   REST     │
        │ Database │   │    API    │  │  Services  │
        └──────────┘   └───────────┘  └────────────┘
```

---

# 🔄 Complete Application Flow

```text
                         USER
                           |
                           ▼
                 ┌───────────────────┐
                 │   React Frontend  │
                 │      Vercel       │
                 └─────────┬─────────┘
                           |
                           ▼
                    REST API Request
                           |
                           ▼
                 ┌───────────────────┐
                 │  Spring Boot API  │
                 │      Railway      │
                 └─────────┬─────────┘
                           |
                ┌──────────┴──────────┐
                |                     |
                ▼                     ▼
          ┌───────────┐         ┌───────────┐
          │   MySQL   │         │  OpenAI   │
          │ Database  │         │    API    │
          └───────────┘         └───────────┘
                |                     |
                └──────────┬──────────┘
                           ▼
                    Backend Response
                           |
                           ▼
                    React.js Frontend
                           |
                           ▼
                    Updated Interface
```

---

# 🔌 REST API

The backend exposes REST APIs for communication with the React frontend.

## Job Application APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/jobs` | Retrieve all job applications |
| POST | `/api/jobs` | Create a new job application |
| PUT | `/api/jobs/{id}` | Update an existing application |
| DELETE | `/api/jobs/{id}` | Delete a job application |

## AI API

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/ai/analyze` | Analyze resume against a job description |

---

# 🌐 Production API

## Job Applications

```text
https://jobtrack-ai-backend-production.up.railway.app/api/jobs
```

## AI Resume Analysis

```text
https://jobtrack-ai-backend-production.up.railway.app/api/ai/analyze
```

---

# 🧠 Backend Architecture

The backend follows a layered Spring Boot architecture.

```text
Controller Layer
       ↓
Service Layer
       ↓
Repository Layer
       ↓
Database
```

For AI analysis:

```text
Controller
    ↓
AI Service
    ↓
OpenAI API
    ↓
AI Response
    ↓
Controller
```

---

# 📁 Backend Project Structure

```text
jobtrack-ai-backend/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── jobtrack/
│       │           └── jobtrack/
│       │               └── backend/
│       │                   │
│       │                   ├── controller/
│       │                   │   ├── JobController.java
│       │                   │   └── AIController.java
│       │                   │
│       │                   ├── model/
│       │                   │   └── Job.java
│       │                   │
│       │                   ├── repository/
│       │                   │   └── JobRepository.java
│       │                   │
│       │                   ├── service/
│       │                   │   └── AIService.java
│       │                   │
│       │                   ├── CorsConfig.java
│       │                   │
│       │                   └── JobtrackBackendApplication.java
│       │
│       └── resources/
│           └── application.properties
│
├── pom.xml
└── README.md
```

---

# 🧩 Backend Components

## JobController

Responsible for job application REST operations.

```text
GET
POST
PUT
DELETE
```

It communicates with the repository layer to manage application data.

---

## Job Model

Represents job application information stored in the database.

The model is mapped to the MySQL database using JPA/Hibernate.

---

## JobRepository

Uses Spring Data JPA to perform database operations.

```text
JobRepository
      ↓
JpaRepository
      ↓
Hibernate
      ↓
MySQL
```

---

## AIController

Provides the AI resume analysis endpoint:

```text
POST /api/ai/analyze
```

It accepts:

```text
Resume
Job Description
```

and returns the AI-generated analysis.

---

## AIService

Responsible for communicating with the OpenAI API.

```text
AIController
      ↓
AIService
      ↓
OpenAI API
      ↓
AI Response
```

The service constructs the resume-analysis prompt and sends it to the configured OpenAI model.

---

# 🗄️ Database

JobTrack AI uses **MySQL** as the persistent database.

### Database

```text
jobtrack_db
```

### Database Technology

```text
Spring Boot
     ↓
Spring Data JPA
     ↓
Hibernate
     ↓
MySQL
```

JPA/Hibernate manages database interaction for job application records.

---

# 🔐 Environment Variables

The backend uses environment variables for sensitive configuration.

### Required Variables

```env
DB_URL=your_database_url
DB_USERNAME=your_database_username
DB_PASSWORD=your_database_password
OPENAI_API_KEY=your_openai_api_key
```

### Local MySQL Example

```env
DB_URL=jdbc:mysql://localhost:3306/jobtrack_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
DB_USERNAME=root
DB_PASSWORD=your_mysql_password
OPENAI_API_KEY=your_openai_api_key
```

Never commit real API keys, database passwords, or other sensitive credentials to GitHub.

---

# 🔐 Security

- OpenAI API credentials are stored as server-side environment variables.
- Database credentials are stored using environment variables.
- API keys are not exposed through the React frontend.
- Sensitive configuration is not hard-coded.
- `.env` files are excluded from version control.
- CORS is configured for the frontend application.

---

# 🌐 CORS Configuration

The backend allows communication from the development and production frontend.

### Development Origins

```text
http://localhost:5173
http://localhost:5174
http://localhost:5175
http://localhost:5176
http://localhost:5177
```

### Production Origin

```text
https://jobtrack-ai-frontend.vercel.app
```

---

# 💻 Local Installation

## Prerequisites

Install:

- Java 21
- Maven
- MySQL
- Git
- IntelliJ IDEA

---

## Step 1 — Clone the Repository

```bash
git clone https://github.com/Rakhi1018/jobtrack-ai-backend.git
```

---

## Step 2 — Open the Project

```bash
cd jobtrack-ai-backend
```

---

## Step 3 — Create the Database

Open MySQL and execute:

```sql
CREATE DATABASE jobtrack_db;
```

---

## Step 4 — Configure Environment Variables

Configure:

```env
DB_URL=jdbc:mysql://localhost:3306/jobtrack_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
DB_USERNAME=root
DB_PASSWORD=your_mysql_password
OPENAI_API_KEY=your_openai_api_key
```

---

## Step 5 — Run the Backend

Using Maven:

```bash
mvn spring-boot:run
```

Or run the application from IntelliJ IDEA:

```text
JobtrackBackendApplication
```

The backend runs on:

```text
http://localhost:8080
```

---

# 🧪 API Testing

The REST APIs can be tested using tools such as Postman or through the frontend application.

## Get Applications

```http
GET http://localhost:8080/api/jobs
```

## Create Application

```http
POST http://localhost:8080/api/jobs
```

## Update Application

```http
PUT http://localhost:8080/api/jobs/{id}
```

## Delete Application

```http
DELETE http://localhost:8080/api/jobs/{id}
```

## AI Resume Analysis

```http
POST http://localhost:8080/api/ai/analyze
```

Example request:

```json
{
  "resume": "Resume content goes here",
  "jobDescription": "Job description goes here"
}
```

---

# 📦 Maven

The project uses Maven for dependency management and build automation.

The backend includes the OpenAI Java SDK:

```xml
<dependency>
    <groupId>com.openai</groupId>
    <artifactId>openai-java</artifactId>
    <version>4.52.0</version>
</dependency>
```

---

# ☁️ Deployment

The Spring Boot backend is deployed using **Railway**.

```text
GitHub
   ↓
Railway
   ↓
Spring Boot Backend
   ↓
Railway MySQL
```

The backend also communicates with the OpenAI API for AI-powered resume analysis.

### Production Backend

```text
https://jobtrack-ai-backend-production.up.railway.app/
```

---

# 🌍 Production Architecture

```text
                         USER
                           |
                           ▼
                 ┌───────────────────┐
                 │   React Frontend  │
                 │      Vercel       │
                 └─────────┬─────────┘
                           |
                           | HTTPS / REST API
                           ▼
                 ┌───────────────────┐
                 │  Spring Boot API  │
                 │      Railway      │
                 └─────────┬─────────┘
                           |
                  ┌────────┴─────────┐
                  |                  |
                  ▼                  ▼
           ┌─────────────┐    ┌─────────────┐
           │    MySQL    │    │   OpenAI    │
           │   Railway   │    │     API     │
           └─────────────┘    └─────────────┘
```

---

# 🔄 End-to-End Feature Flow

```text
                    JobTrack AI
                         |
       ┌─────────────────┼─────────────────┐
       |                 |                 |
       ▼                 ▼                 ▼
 Dashboard        Applications       Resume Analyzer
       |                 |                 |
       |                 ▼                 ▼
       |              MySQL          OpenAI API
       |                 |                 |
       └─────────────────┼─────────────────┘
                         |
                         ▼
                    Job Matcher
                         |
                         ▼
                   Resume Builder
                         |
                         ▼
                  Interview Tracking
                         |
                         ▼
                      Analytics
                         |
                         ▼
                      Settings
```

---

# 📌 Project Highlights

- Developed a complete backend using **Java and Spring Boot**.
- Designed REST APIs for job application management.
- Implemented CRUD operations using **Spring Data JPA and Hibernate**.
- Integrated **MySQL** for persistent application data.
- Integrated the **OpenAI API** for AI-powered resume analysis.
- Built backend support for resume analysis, job matching, application tracking, interviews, and analytics.
- Implemented CORS configuration for frontend-backend communication.
- Used environment variables for database and API credentials.
- Deployed the Spring Boot backend and MySQL database using **Railway**.
- Connected the production backend with a React.js frontend deployed on **Vercel**.

---

# 🔗 Frontend Integration

The React.js frontend is maintained separately.

### Frontend Repository

```text
https://github.com/Rakhi1018/jobtrack-ai-frontend
```

### Frontend Production URL

```text
https://jobtrack-ai-frontend.vercel.app/
```

### Backend Production URL

```text
https://jobtrack-ai-backend-production.up.railway.app/
```

---

# 📚 Complete Technology Stack

```text
Frontend
    React.js
    JavaScript
    HTML5
    CSS3
    Vite
    Lucide React

Backend
    Java
    Spring Boot
    Spring Data JPA
    Hibernate
    REST APIs
    Maven

Database
    MySQL

AI
    OpenAI API

Deployment
    Vercel
    Railway

Tools
    Git
    GitHub
    IntelliJ IDEA
    VS Code
    MySQL Workbench
```

---

# 👨‍💻 Author

**Rakesh Vynala**

Computer Science & Engineering Graduate

**GitHub:**  
https://github.com/Rakhi1018

---

# 📄 License

This project is developed for educational, portfolio, and demonstration purposes.
