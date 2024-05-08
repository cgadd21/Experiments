namespace PersonalBlazorWebAssemblyApp.Server.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class AppController : ControllerBase
    {
        private readonly IConfiguration _config;

        public AppController(IConfiguration config)
        {
            _config = config;
        }

        [HttpGet("education")]
        public async Task<ActionResult<List<Education>>> GetEducation()
        {
            using var connection = new MySqlConnection(_config.GetConnectionString("DefaultConnection"));
            var query = "Select * FROM Education;";
            var items = await connection.QueryAsync<Education>(query);
            return Ok(items.ToList());
        }

        [HttpGet("experience")]
        public async Task<ActionResult<List<Experience>>> GetExperience()
        {
            using var connection = new MySqlConnection(_config.GetConnectionString("DefaultConnection"));
            var query = "Select * FROM Experience;";
            var items = await connection.QueryAsync<Experience>(query);
            return Ok(items.ToList());
        }

        [HttpGet("volunteer")]
        public async Task<ActionResult<List<Volunteer>>> GetVolunteer()
        {
            using var connection = new MySqlConnection(_config.GetConnectionString("DefaultConnection"));
            var query = "Select * FROM Volunteer;";
            var items = await connection.QueryAsync<Volunteer>(query);
            return Ok(items.ToList());
        }

        [HttpGet("project")]
        public async Task<ActionResult<List<Project>>> GetProjects()
        {
            using var connection = new MySqlConnection(_config.GetConnectionString("DefaultConnection"));
            var query = "Select * FROM Project;";
            var items = await connection.QueryAsync<Project>(query);
            return Ok(items.ToList());
        }

        [HttpGet("skill")]
        public async Task<ActionResult<List<Skill>>> GetSkills()
        {
            using var connection = new MySqlConnection(_config.GetConnectionString("DefaultConnection"));
            var query = "Select * FROM Skill;";
            var items = await connection.QueryAsync<Skill>(query);
            return Ok(items.ToList());
        }

        [HttpGet("todo")]
        public async Task<ActionResult<List<Todo>>> GetTodo()
        {
            using var connection = new MySqlConnection(_config.GetConnectionString("DefaultConnection"));
            var query = "Select * FROM Todo;";
            var items = await connection.QueryAsync<Todo>(query);
            return Ok(items.ToList());
        }
    }
}
