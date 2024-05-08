namespace PersonalBlazorWebAssemblyApp.Client.Services
{
    public interface IAppService
    {
        List<Education> Educations { get; set; }
        List<Experience> Experiences { get; set; }
        List<Volunteer> Volunteers { get; set; }
        List<Project> Projects { get; set; }
        List<Skill> Skills { get; set; }
        List<Todo> Todos { get; set; }

        Task GetEducation();
        Task GetExperience();
        Task GetVolunteer();
        Task GetProjects();
        Task GetSkills();
        Task GetTodo();
    }
}
