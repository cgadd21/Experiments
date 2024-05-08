namespace PersonalBlazorWebAssemblyApp.Client.Services
{
    public class AppService : IAppService
    {
        private readonly HttpClient _http;

        public AppService(HttpClient http)
        {
            _http = http;
        }

        public List<Education> Educations { get; set; } = new();
        public List<Experience> Experiences { get; set; } = new();
        public List<Volunteer> Volunteers { get; set; } = new();
        public List<Project> Projects { get; set; } = new();
        public List<Skill> Skills { get; set; } = new();
        public List<Todo> Todos { get; set; } = new();

        public async Task GetEducation()
        {
            var result = await _http.GetFromJsonAsync<List<Education>>("api/App/education");
            if (result != null)
                Educations = result;
        }

        public async Task GetExperience()
        {
            var result = await _http.GetFromJsonAsync<List<Experience>>("api/App/experience");
            if (result != null)
                Experiences = result;
        }

        public async Task GetVolunteer()
        {
            var result = await _http.GetFromJsonAsync<List<Volunteer>>("api/App/volunteer");
            if (result != null)
                Volunteers = result;
        }

        public async Task GetProjects()
        {
            var result = await _http.GetFromJsonAsync<List<Project>>("api/App/project");
            if (result != null)
                Projects = result;
        }

        public async Task GetSkills()
        {
            var result = await _http.GetFromJsonAsync<List<Skill>>("api/App/skill");
            if (result != null)
                Skills = result;
        }

        public async Task GetTodo()
        {
            var result = await _http.GetFromJsonAsync<List<Todo>>("api/App/todo");
            if (result != null)
                Todos = result;
        }
    }
}
