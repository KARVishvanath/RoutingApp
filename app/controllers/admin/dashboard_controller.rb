class Admin::DashboardController < ApplicationController
  def main
  end

  def user
  end

  def blog
    @blogs = Blog.all
  end
end
