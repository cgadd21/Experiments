DROP TABLE skill;
CREATE TABLE skill (
    skillId INT AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(50),
    skillName VARCHAR(50)
);

INSERT INTO skill (category, skillName) VALUES 
('Programming Languages', 'C#'),
('Programming Languages', 'Java'),
('Web Development', 'PHP'),
('Web Development', 'TypeScript'),
('Web Development', 'JavaScript'),
('Web Development', 'CSS'),
('Web Development', 'HTML'),
('Database Technologies', 'SQL'),
('Database Technologies', 'MySQL'),
('Database Technologies', 'PostgreSQL'),
('Database Technologies', 'Oracle'),
('Frameworks', 'Angular'),
('Frameworks', 'Blazor'),
('Frameworks', 'Express'),
('Frameworks', 'React'),
('Frameworks','Spring Boot');

DROP TABLE project;
CREATE TABLE project (
    projectId INT AUTO_INCREMENT PRIMARY KEY,
    projectName VARCHAR(100),
    projectLink VARCHAR(255),
    projectDescription TEXT
);

INSERT INTO project (projectName, projectLink, projectDescription) VALUES 
('Election Application for Professional Societies','https://github.com/RIT-iSchool/election-project-the_balkans','Worked as a team to built a web app using Postgres, Express, and Next.js for elections within professional societies.'),
('iSchool React App','https://github.com/cgadd21/iSchool-React-App','I developed a web app using React to display information for RIT\'s iSchool using Tailwind and DaisyUI components.'),
('iSchool ASP.NET MVC App','https://github.com/cgadd21/iSchool-ASP.NET-MVC','I created a web app using ASP.NET MVC to display information for RIT\'s iSchool using Jquery.'),
('Adorable Animals Vs. Military Industrial Complex','https://github.com/cgadd21/Adorable-Animals-Vs.-Military-Industrial-Complex','I built a web app with Typescript, CSS, and HTML that has adorable animals face off against the military industrial complex.'),
('Resume Angular App','https://github.com/cgadd21/Resume-Angular-App','I independently developed a web app with Angular, emphasizing clean code and efficient data handling using TypeScript and Angular services. This project demonstrates my technical proficiency in front-end development.'),
('Resume Lumen API','https://github.com/cgadd21/Resume-PHP-API','Built a powerful API using Lumen framework, boosting system speed and reliability. Leveraged top-notch tech for a smooth and efficient backend solution, showcasing expertise in scalable and robust development.'),
('Resume Spring Boot API','https://github.com/cgadd21/Resume-Spring-Boot-API', 'Developed a Spring Boot application with CRUD capabilities, utilizing MySQL for data management.'),
('Resume Blazor WebAssembly App','https://github.com/cgadd21/Resume-Blazor-App','Created custom classes to map data to from Dapper queries. Used dependency injection in razor pages to display information from MySQL Database.'),
('Faculty Research App','https://github.com/cgadd21/Faculty-Research-App','Designed a database application enabling faculty, students, and guests to efficiently search and connect based on the school''s research interests, fostering collaboration and project mentorship.');

DROP TABLE education;
CREATE TABLE education (
    educationId INT AUTO_INCREMENT PRIMARY KEY,
    institutionName VARCHAR(100),
    degree VARCHAR(100),
    graduationYear INT
);

INSERT INTO education (institutionName, degree, graduationYear) VALUES 
('Rochester Institute of Technology', 'Bachelor\'s degree, Computing and Information Technology', 2024),
('Monroe Community College', 'Associate\'s degree, Information Technology', 2022),
('Attica Senior High School', 'High School Diploma', 2020),
('TestOut Corporation', 'Certified PC Pro', 2019);

DROP TABLE experience;
CREATE TABLE experience (
    experienceId INT AUTO_INCREMENT PRIMARY KEY,
    jobTitle VARCHAR(100),
    companyName VARCHAR(100),
    employmentType VARCHAR(50),
    startDate DATE,
    endDate DATE,
    description TEXT,
    link VARCHAR(255)
);

INSERT INTO experience (jobTitle, companyName, employmentType, startDate, endDate, description, link) VALUES 
('Software Engineer', 'Attica Package Company Inc.', 'Freelance', '2022-12-01', NULL, 'Created and hosted a company website. Developed a SQL database application using Microsoft Access to streamline material tracking, replacing Excel sheets. Automated report calculations and enabled data querying based on parameters.','https://atticapackageco.com/'),
('Software Engineer', 'Touchstone Technology Inc.', 'Internship', '2023-03-01', NULL, 'Created a Blazor WebAssembly web app for logging employee assignments, generating reports,
tracking inventory and yield, printing labels, displaying schedules, and searching part details. Implemented APIs for HTTPS requests to SQL database using Dapper. Integrated GitLab for version control. Enhanced sister company''s WinForms app by fixing device activation and upgrading to label printing from laser engraving','https://touchstn.com/'),
('Product Zone Specialist', 'Apple', 'Full-time', '2021-07-01', '2022-01-31', 'Assisted customers in finding a device to match their needs. Developed skills in many departments to become more well-rounded, and to aid co-workers. Opened, closed, and prepared the store for review from upper management. Supported new co-workers training process through shadowing and reverse shadowing. Collaborated with co-workers to improve techniques and solve problems. First on waitlist when returning to store for seasonal employment.','https://www.apple.com/'),
('Produce Clerk', 'Tops Friendly Markets', 'Part-time', '2018-12-01', '2022-08-31', 'Managed inventory of various food items in the produce department. Created displays around the store to increase customer experience. Set up store for company executives. Recognized tasks that needed completion. Directed co-workers on daily tasks. Assisted other departments when called upon.','https://www.topsmarkets.com/');

DROP TABLE volunteer;
CREATE TABLE volunteer (
    volunteerId INT AUTO_INCREMENT PRIMARY KEY,
    jobTitle VARCHAR(100),
    companyName VARCHAR(100),
    description TEXT,
    link VARCHAR(255)
);

INSERT INTO volunteer (jobTitle, companyName, description, link) VALUES 
('Volunteer', 'Gateway Home Attica', 'Set up, worked, and took down fundraising events. Constructed concrete walkway outside the home. Assisted with technical setup.','https://gatewayhomeattica.org/');
