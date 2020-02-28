require 'test_helper'

class BlogTest < ActiveSupport::TestCase
  # test "the truth" do
  #   assert true
  # end

  test "should not save article without title" do
    blog = Blog.new
    assert_not blog.save
  end

end
